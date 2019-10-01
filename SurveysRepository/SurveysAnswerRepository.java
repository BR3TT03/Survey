package com.example.demo.SurveysRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.SurveyModel.SurveysAnswer;
@Repository
public interface SurveysAnswerRepository extends CrudRepository<SurveysAnswer, Integer>{

}
