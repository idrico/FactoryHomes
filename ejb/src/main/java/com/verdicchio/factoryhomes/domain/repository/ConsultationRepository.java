package com.verdicchio.factoryhomes.domain.repository;

        import com.verdicchio.factoryhomes.domain.model.*;
        import com.verdicchio.factoryhomes.infrastructure.db.entity.CompletedDesign;
        import com.verdicchio.factoryhomes.infrastructure.db.entity.Consultation;
        import com.verdicchio.factoryhomes.infrastructure.db.entity.ZipCode;

        import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

public interface ConsultationRepository {

    House findHouseById(long id);

    Product findProductById(long id);

    CompletedDesign findCompletedDesignById(long id);

    List<Product> getHouseDesign();

    Consultation findById(Long id);

    List<Consultation> findByZipCode(ZipCode zipCode);

    List<Consultation> findAllOrderedByCustomer();

    List<ZipCode> findAllOrderedByCode();

    List<ZipCode> findAllOrderedByCity();

}