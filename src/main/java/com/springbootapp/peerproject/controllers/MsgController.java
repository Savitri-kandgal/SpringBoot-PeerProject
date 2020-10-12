package com.springbootapp.peerproject.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootapp.peerproject.dto.MessageDTO;
import com.springbootapp.peerproject.service.MsgService;

@Controller
public class MsgController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MsgController.class);

	@RequestMapping("/")
	public String welcome() {
		LOGGER.info("LOGGER : PeerPjctController : Invoked welcome page");
		return "welcome";
	}

	@Autowired
	public MsgService msgService;

	@RequestMapping("/onclick")
	public String display(Model model, MessageDTO dto) { 

		try {
			LOGGER.info("LOGGER : PeerPjctController :value passing from view to the DTO: " + dto.getfName() + ","
					+ dto.gettName() + "," + dto.getMessage());
			LOGGER.info("LOGGER : PeerPjctController :calling msgService.MsgServiceImpl()");
			int status = this.msgService.validateAndSave(dto);
			LOGGER.info("LOGGER : PeerPjctController :status =" + status);

			LOGGER.info(
					"LOGGER : PeerPjctController :printing status from controller after executing msgService.validateAndSave(dto) :"
							+ status);
			if (status == 0) {
				LOGGER.info("LOGGER : PeerPjctController :saving data to success page");

				model.addAttribute("dto", dto);
				LOGGER.info("LOGGER : PeerPjctController :------------ENDS : display()--------------------");
				return "success";
			} else {
				LOGGER.info("LOGGER : PeerPjctController :fileds are missing, please update ");
				LOGGER.info("LOGGER : PeerPjctController :-------------ENDS : display()--------------------");
				model.addAttribute("error", "fileds are missing, please update");
				return "error";
			}
		} catch (Exception e) {
			LOGGER.info("LOGGER : PeerPjctController :" + e.getMessage());
		}
		LOGGER.info("LOGGER : PeerPjctController :------------ENDS : display()--------------------");
		return "success";

	}

}
