package com.rindus.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegsDTO {
	Map<String,String> regs=new HashMap<>();

	public RegsDTO(){}
	
	public Map<String,String> getRegs() {
		return regs;
	}

	public void setRegs(Map<String,String> regs) {
		this.regs = regs;
	}
	
}
