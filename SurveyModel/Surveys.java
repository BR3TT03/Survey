package com.example.demo.SurveyModel;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 
public class Surveys implements Serializable {
	private static final long serialVersionUID = 182014846975405027L;
	@Id
	@GeneratedValue
	private int someId;
	private int uId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sId")
	private SurveysAnswer surveysAnswer;
	
	public Surveys() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Surveys(int someId, int sId, int uId, SurveysAnswer surveysAnswer) {
		super();
		this.someId = someId;
		
		this.uId = uId;
		this.surveysAnswer = surveysAnswer;
	}

	public int getSomeId() {
		return someId;
	}

	public void setSomeId(int someId) {
		this.someId = someId;
	}

	
	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public SurveysAnswer getSurveysAnswer() {
		return surveysAnswer;
	}

	public void setSurveysAnswer(SurveysAnswer surveysAnswer) {
		this.surveysAnswer = surveysAnswer;
	}

		
	
}
