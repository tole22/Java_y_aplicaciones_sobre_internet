package jyaa.dao;


public class DaosFactory {


	public static DaoPersona getPersonDAO() {
		return new DAOPersonaJPA();
	}	
}
