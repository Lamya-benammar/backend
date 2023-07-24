package com.stage.backend.service;

import java.util.List;

import com.stage.backend.entity.Bordereau;

public interface IBordereau {
	Bordereau addBordereau(Bordereau bordereau);
    List<Bordereau> getAllBordereau();
    void deleteBordereau(int BordereauId);
}
