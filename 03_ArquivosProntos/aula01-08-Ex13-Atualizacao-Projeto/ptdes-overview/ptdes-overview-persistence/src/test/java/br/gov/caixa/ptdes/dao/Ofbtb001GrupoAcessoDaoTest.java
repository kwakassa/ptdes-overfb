package br.gov.caixa.ptdes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import br.gov.caixa.ptdes.entity.Ofbtb001GrupoAcesso;

public class Ofbtb001GrupoAcessoDaoTest {
	Logger logger = Logger.getLogger(Ofbtb001GrupoAcessoDaoTest.class);
	@Test
	public void buscaTodosOsRegistros() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("overdb_test");
		EntityManager em = emf.createEntityManager();
		try {
			Ofbtb001GrupoAcessoDao dao = new Ofbtb001GrupoAcessoDao();
			dao.setEntityManager(em);
			List<Ofbtb001GrupoAcesso> listaRegistros = dao.buscaTudo();
			logger.info("Num Registros: "+ listaRegistros.size());
			for (Ofbtb001GrupoAcesso registro : listaRegistros) {
				logger.info(registro.getNoGrupoAcesso());
			}
			Assert.assertTrue(listaRegistros.size() > 0);
		} catch (Exception e) {
			logger.error("Ocorreu " + e.getClass(), e);
			Assert.fail();
		} finally {
			em.close();
			emf.close();
		}
	}
}
