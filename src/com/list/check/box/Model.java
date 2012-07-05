package com.list.check.box;

public class Model {

	private String name;
	private boolean selected;

	public Model(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
