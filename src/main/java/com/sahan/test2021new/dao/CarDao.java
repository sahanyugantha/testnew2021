package com.sahan.test2021new.dao;

import com.sahan.test2021new.config.DbConnection;
import com.sahan.test2021new.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CarDao {
	private static Logger logger = LogManager.getLogger(CarDao.class);

	public static List<Car> getCars(){
		
		List<Car> cars = new ArrayList<Car>();
		
		cars.add(new Car(1, "Axio", "Toyota"));
		cars.add(new Car(2, "520D", "BMW"));
		cars.add(new Car(3, "WagonR", "Suzuki"));
		
		return cars;
	}
	
	public static List<Car> getAll(){
//		logger.fatal("XXX THIS IS A FATAL LOG"); // log message
//		logger.error("XXy THIS IS A ERROR LOG"); // log message
//		logger.warn("XXX THIS IS A WARN LOG"); // log message
//		logger.info("XXX THIS IS A INFO LOG"); // log message
//		logger.debug("XXX THIS IS A DEBUG LOG"); // log message
//		logger.trace("XXX THIS IS A TRACE LOG"); // log message
		try {
			List<Car> cars = new ArrayList<>();

			DbConnection dbConnection = new DbConnection();
			Connection conn = dbConnection.getConnection();
			String sql = "SELECT * FROM tbl_car";
			 
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				Car car = new Car();
				car.setId(rs.getInt("id"));
				car.setBrand(rs.getString("brand"));
				car.setModel(rs.getString("model"));
				cars.add(car);
			}
						
			return cars;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		 
		 
	}
}
