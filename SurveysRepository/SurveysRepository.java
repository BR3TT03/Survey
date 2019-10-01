package com.example.demo.SurveysRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.SurveyModel.Surveys;
@Repository
public interface SurveysRepository extends CrudRepository<Surveys, Integer>{

}
