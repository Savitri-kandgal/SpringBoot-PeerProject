package com.SpringbootApp.peerproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.SpringbootApp.peerproject.Service.MsgService;
import com.SpringbootApp.peerproject.dto.MessageDTO;

@Controller
public class PeerPjctController {

@RequestMapping("/")
	public String welcome() {
		System.out.println("Invoked welcome page");
		return "welcome";
	}

	@Autowired
	public MsgService msgService;

	/*
	 * @RequestMapping("/onclick") public String display(Model
	 * model, @RequestParam("fname") String fromName, @RequestParam("tname") String
	 * toName,
	 * 
	 * @RequestParam("message") String msg) { // (name="name") (name="message")
	 * model.addAttribute("fName", fromName); model.addAttribute("tName", toName);
	 * model.addAttribute("message", msg); return "success"; }
	 */

	@RequestMapping("/onclick")
	public String display(Model model, MessageDTO dto) { // (name="name") (name="message")

		try {
			System.out.println("value passing from view to the DTO: "+dto.getfName()+","+ dto.gettName()+","+dto.getMessage());
			System.out.println("CONTROLLER :calling msgService.MsgServiceImpl()");
			int status = this.msgService.validateAndSave(dto);
			System.out.println("status ="+status);
			
			System.out.println(
					"CONTROLLER :printing status from controller after executing msgService.validateAndSave(dto) :"
							+ status);
			if (status == 0) {
				System.out.println("CONTROLLER :saving data to success page");

				model.addAttribute("dto", dto);
				System.out.println("LOGGER : CONTROLLER :-------------ENDS : display()--------------------");
				return "success";
			} else {
				System.out.println(" CONTROLLER : fileds are missing, please update ");
				System.out.println("CONTROLLER :-------------ENDS : display()--------------------");
				model.addAttribute("error", "fileds are missing, please update");
				return "error";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("LOGGER : CONTROLLER :-------------ENDS : display()--------------------");
		return "success";

	}
}
