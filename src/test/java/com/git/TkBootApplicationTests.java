package com.git;

import com.example.TkBootApplication;
import com.example.domain.BuildingPosition;
import com.example.service.BuildingPositionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TkBootApplication.class)
public class TkBootApplicationTests {

	@Autowired
	private BuildingPositionService buildingPositionService;

	@Test
	public void contextLoads() {

		BuildingPosition buildingPosition = buildingPositionService.findByPrimaryKey(1L);
		System.out.println(buildingPosition);

	}

}
