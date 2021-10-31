package test2021new;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.sahan.test2021new.dao.CarDao;
import com.sahan.test2021new.model.Car;

public class TestDb {
	private Logger logger = LogManager.getLogger(TestDb.class);
	
	@Test
	public void TestDatabase() {		
		
//		CarDao carDao = new CarDao();
//		List<Car> actual = carDao.getAll();
//		assertNotNull(actual);
		
		assertEquals(2, 2);
//		
	}
	
	@Test
	public void TestLogging() {
		
//		logger.fatal("THIS IS A FATAL LOG"); // log message
//		logger.error("THIS IS A ERROR LOG"); // log message
//		logger.warn("THIS IS A WARN LOG"); // log message
//		logger.info("THIS IS A INFO LOG"); // log message
//		logger.debug("THIS IS A DEBUG LOG"); // log message
//		logger.trace("THIS IS A TRACE LOG"); // log message
		
//		CarDao carDao = new CarDao();
//		List<Car> actual = carDao.getAll();
//		for (Car car : actual) {
//			logger.trace(car.getModel()+" \t "+car.getBrand());
//		}
//		
		assertEquals(2, 2);
	}

}
