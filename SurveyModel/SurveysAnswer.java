package com.example.demo.SurveyModel;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class SurveysAnswer implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	
	@GeneratedValue
	private int sId;
	private int aId;
	private int qId;
	private String remarks;
	
	@OneToOne(mappedBy = "surveysAnswer")
	
	private Surveys survey;

	public SurveysAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SurveysAnswer(int sId, int aId, int qId, String remarks, Surveys survey) {
		super();
		this.sId = sId;
		this.aId = aId;
		this.qId = qId;
		this.remarks = remarks;
		this.survey = survey;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Surveys getSurvey() {
		return survey;
	}

	public void setSurvey(Surveys survey) {
		this.survey = survey;
	}
	
}
