package com.springbootapp.peerproject.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapp.peerproject.Entity.AppInfoEntity;
import com.springbootapp.peerproject.Entity.EnvEntity;
import com.springbootapp.peerproject.dto.AppInfoDTO;
import com.springbootapp.peerproject.dto.EnvDTO;
import com.springbootapp.peerproject.repository.AppInfoRepository;
import com.springbootapp.peerproject.repository.EnvRepository;

@Service
public class AppInfoServiceImpl implements AppInfoService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppInfoServiceImpl.class);

	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	Date date = new Date();

	String frmtdDate = dateFormat.format(date);

	Date dateOne = new Date();
	@Autowired
	private AppInfoRepository appInfoRepository;
	@Autowired
	private EnvRepository envRepository;

	public AppInfoServiceImpl() {
		LOGGER.info("LOGGER : AppInfoServiceImpl :" + this.getClass().getSimpleName() + "object created");
	}

	@Override
	public int validateAndSaveAppInfo(AppInfoDTO appDTO, List<AppInfoDTO> list) { // (AppInfoDTO appDTO, List<EnvDTO>
																					// list)
		int valid = 1;
		try {
			if (Objects.nonNull(appDTO)) {
				LOGGER.info("LOGGER : AppInfoServiceImpl : checking if appDTO obj is null:" + appDTO);
				LOGGER.info("LOGGER : AppInfoServiceImpl : checking if envDTO list is null:" + list);

				LOGGER.info("LOGGER : AppInfoServiceImpl : starting to validate fields");

				if (appDTO.getpName() != null && !appDTO.getpName().isEmpty()) {
					LOGGER.info("LOGGER : AppInfoServiceImpl : project name is valid :" + appDTO.getpName());

					valid = 0;
				} else {
					LOGGER.info("LOGGER : AppInfoServiceImpl : project name is invalid :");
					valid = 1;
				}

				if (valid == 0 && appDTO.gettEmail() != null && !appDTO.gettEmail().isEmpty()) {
					LOGGER.info("LOGGER : AppInfoServiceImpl : email id is valid :" + appDTO.gettEmail());

					valid = 0;
				} else {
					LOGGER.info("LOGGER : AppInfoServiceImpl : email id is invalid :");
					valid = 1;
				}

				if (valid == 0 && appDTO.getdComissined() != null && !appDTO.getdComissined().isEmpty()) {
					LOGGER.info("LOGGER : AppInfoServiceImpl : de-commissined is valid :" + appDTO.getdComissined());
					valid = 0;
				} else {
					LOGGER.info("LOGGER : AppInfoServiceImpl : de-commissined is invalid :");
					valid = 1;
				}

				LOGGER.info("LOGGER : AppInfoServiceImpl : Checking if all fields are entered");
				if (valid == 0) {
					LOGGER.info("LOGGER : AppInfoServiceImpl : informations are valid :" + valid);

					// new code
					AppInfoEntity appInfoEntity = new AppInfoEntity();
					BeanUtils.copyProperties(appDTO, appInfoEntity);

					appInfoEntity.setCreatedBy("Savitri");
					appInfoEntity.setCreatedTime(frmtdDate);
					appInfoEntity.setUpdatedBy("Savitri");
					appInfoEntity.setUpdatedTime(frmtdDate);
					
					List<EnvEntity> envEntityList = new ArrayList<>();

					for (EnvDTO dto : appDTO.getEnvironmentList()) {
						EnvEntity envEntity = new EnvEntity();
						BeanUtils.copyProperties(dto, envEntity);
						envEntity.setAppInfoEntity(appInfoEntity);
						envEntityList.add(envEntity);
					}
					appInfoEntity.setEnvList(envEntityList);

					appInfoRepository.save(appInfoEntity);

					LOGGER.info("LOGGER : AppInfoServiceImpl : saved data to the DB");
					LOGGER.info(
							"LOGGER : AppInfoServiceImpl : SERVICE:------------ENDS : validateAndSaveAppInfo()-------------------------------");
					return 0;
				} else {
					LOGGER.info("LOGGER : AppInfoServiceImpl : fields are missing, please enter the missing fields");
					return 1;
				}
			} else {
				LOGGER.info("LOGGER : AppInfoServiceImpl : dto is null");
				return 1;
			}
		} catch (Exception e) {
			LOGGER.info("LOGGER : AppInfoServiceImpl : " + e.getMessage());
		}
		LOGGER.info(
				"LOGGER : AppInfoServiceImpl : ------------ENDS : validateAndSaveAppInfo()-------------------------------");

		return 0;
	}
}
