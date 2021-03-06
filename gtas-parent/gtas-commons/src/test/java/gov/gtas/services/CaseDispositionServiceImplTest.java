package gov.gtas.services;

import gov.gtas.config.CommonServicesConfig;
import gov.gtas.repository.CaseDispositionRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CommonServicesConfig.class })
public class CaseDispositionServiceImplTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Autowired
    private CaseDispositionService caseDispService;


    @Test
    public void testCreateCase() throws Exception {
    	Random _rand = new Random();
        List<Long> _tempHitList = new ArrayList<>();
        _tempHitList.add(new Long(_rand.nextInt(1000)));
        _tempHitList.add(new Long(_rand.nextInt(1000)));
        _tempHitList.add(new Long(_rand.nextInt(1000)));

        assertTrue((caseDispService.create((new Long(_rand.nextInt(1000))),
        		(new Long(_rand.nextInt(1000))),_tempHitList)).getId()!=null);
    }


}