package paw.aplication.Paw2.Repository;

import org.springframework.data.repository.CrudRepository;

import paw.aplication.Paw2.Entity.Oferta;




public interface OfertaRepository extends CrudRepository<Oferta, Integer> {
    public Oferta findOfertaById(Integer id);
}
