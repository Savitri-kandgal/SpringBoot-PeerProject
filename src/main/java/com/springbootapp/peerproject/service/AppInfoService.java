package com.springbootapp.peerproject.service;

import java.util.List;

import com.springbootapp.peerproject.dto.AppInfoDTO;


public interface AppInfoService {

	public int validateAndSaveAppInfo(AppInfoDTO appDTO, List<AppInfoDTO> list ); //(AppInfoDTO, List<EnvDTO> list )
}
