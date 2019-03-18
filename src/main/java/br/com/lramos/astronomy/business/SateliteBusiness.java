package br.com.lramos.astronomy.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lramos.astronomy.entity.SateliteEntity;
import br.com.lramos.astronomy.repository.SateliteRepository;

/**
 * @author leonardorm
 *
 */
@Service
public class SateliteBusiness {

	@Autowired
	private SateliteRepository sateliteRepo;
	
	/**
	 * @return {@link List} de todos os {@link SateliteEntity}.
	 */
	public List<SateliteEntity> listaTodos() {
		return sateliteRepo.findAll();
	}
	
}
