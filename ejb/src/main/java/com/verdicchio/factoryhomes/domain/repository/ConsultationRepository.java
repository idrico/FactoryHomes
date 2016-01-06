package com.verdicchio.factoryhomes.domain.repository;

        import com.verdicchio.factoryhomes.domain.model.*;
        import com.verdicchio.factoryhomes.integration.db.entity.CompletedDesign;
        import com.verdicchio.factoryhomes.integration.db.entity.Consultation;
        import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

        import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

public interface ConsultationRepository {

    Consultation findById(Long id);

    List<Consultation> findByZipCode(ZipCode zipCode);

}