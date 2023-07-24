package com.stage.backend.service;

import java.util.List;

import com.stage.backend.entity.SugRec;

public interface ISugRecService {
	SugRec addSugRec(SugRec sugRec);
    List<SugRec> getAllSugRec();
    void deleteSugRec(int sugRecId);
}
