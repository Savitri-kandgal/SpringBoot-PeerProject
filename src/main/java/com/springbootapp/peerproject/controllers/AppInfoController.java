package com.springbootapp.peerproject.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootapp.peerproject.dto.AppInfoDTO;
import com.springbootapp.peerproject.service.AppInfoService;

@Controller
@RequestMapping("/")
public class AppInfoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppInfoController.class);

	List<AppInfoDTO> envList;

	@Autowired(required = true)
	public AppInfoService appInfoService;

	@PostConstruct
	void init() {
		envList = new ArrayList<AppInfoDTO>();
	}

	@RequestMapping("/onSaveAppInfo")
	public String saveAppInfo(Model model, AppInfoDTO appDTO) { // (name="name") (name="message") //AppInfoDTO appDTO

		try {
			LOGGER.info("Environment list is {}", appDTO.getEnvironmentList());
			LOGGER.info("LOGGER : PeerPjctController: value passing from view to the AppInfoDTO: " + appDTO.getpName()
					+ "," + appDTO.gettManager() + "," + appDTO.gettEmail() + "," + appDTO.getdComissined() + ","
					+ appDTO.getdDate() + "," + appDTO.getVersion() + "," + appDTO.getlReleased() + ","
					+ appDTO.getnReleased());
			LOGGER.info("LOGGER : PeerPjctController :calling appInfoService.validateAndSaveAppInfo()");
			int status = this.appInfoService.validateAndSaveAppInfo(appDTO, envList); //
			LOGGER.info("LOGGER : PeerPjctController : status =" + status);

			LOGGER.info(
					"LOGGER : PeerPjctController : printing status from controller after executing appInfoService.validateAndSaveAppInfo()"
							+ status);
			if (status == 0) {
				LOGGER.info("LOGGER : PeerPjctController: CONTROLLER :saving data to success page");

				model.addAttribute("dto", appDTO);
				LOGGER.info("LOGGER : PeerPjctController: -------------ENDS : display()--------------------");
				return "AddAppInfoSuccess";
			} else {
				LOGGER.info("LOGGER : PeerPjctController: fileds are missing, please update ");
				LOGGER.info("LOGGER : PeerPjctController: -------------ENDS : display()--------------------");
				model.addAttribute("error", "fileds are missing, please update");
				return "error";
			}
		} catch (Exception e) {
			LOGGER.info("LOGGER : PeerPjctController: " + e.getMessage());
		}
		LOGGER.info("LOGGER : PeerPjctController: -------------ENDS : display()--------------------");
		return "AddAppInfoSuccess";

	}

}
