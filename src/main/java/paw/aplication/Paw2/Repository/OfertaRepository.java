package paw.aplication.Paw2.Repository;

import org.springframework.data.repository.CrudRepository;
import paw.aplication.Paw2.Entity.Oferta;

import java.util.List;

public interface OfertaRepository extends CrudRepository<Oferta, Integer> {

    List<Oferta> listAllOferta();
    public Oferta findOfertaById(Integer id);

}
