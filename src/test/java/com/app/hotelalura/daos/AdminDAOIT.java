package com.app.hotelalura.daos;

import com.app.hotelalura.dto.AdminDTO;
import com.app.hotelalura.entities.Admin;
import com.app.hotelalura.utils.cript.PasswordEncoder;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdminDAOIT {
    private final AdminDAO adminDao = AdminDAO.getInst();
    public int idtemp;
    public AdminDAOIT() {
    }

    
    @Test
    @Order(1)
    public void testAdminDAO() {
        System.out.println("AdminDAO");
        try {
            assertEquals(true, adminDao != null);
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }

    }

    
    
    @Test
    @Order(2)
    public void testSave() {
        System.out.println("save");
        Admin admin = new Admin();
        admin.setEmail("sebadjkevin@gmail.com");
        admin.setPassword("12345");
        admin.setPhone("3624315169");
        try {
            Integer id = adminDao.save(admin);
            idtemp=id;
            assertEquals(true, (id != null && id > 0));
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    
    @Test
    @Order(3)
    public void testFindAll() {
        System.out.println("findAll");
        List<Admin> result;
        try {
            result = adminDao.findAll();
            for (Admin adm : result) {
                System.out.println("-- "+adm);
            }
            assertEquals(false, result.isEmpty());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

    }

    @Test
    @Order(4)
    public void testFindOne() {
        System.out.println("findOne");
        Optional<Admin> result = null;
        try {
            result = adminDao.findOne(idtemp);
            if (result != null) {
                System.out.println(result.get());
                assertEquals(true, result.isPresent());
            } else {
                throw new Exception("Admin not found");
            }

        } catch (Exception ex) {
            fail(ex.getMessage());

        }
    }
    @Test
    @Order(5)
    public void testDelete(){
        System.out.println("delete");
        try {
            adminDao.delete(idtemp);
            assertEquals(true, true);

        } catch (Exception ex) {
            fail(ex.getMessage());
        }
        
    }
    @Test
    @Order(6)
    public void testFindByEmail(){
        System.out.println("find by email");
        try {
            Optional<AdminDTO> d=adminDao.findByEmail("sebadjkevin@gmail.com");
            System.out.println(d);
            assertEquals(true, d.isPresent());

        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    @Order(7)
    public void testComparePassword(){
        System.out.println("test password ");
        try {
            String passwordInput= "dsdassadsad";
            Optional<AdminDTO> d=adminDao.findByEmail("sebadjkevin@gmail.com");
            Boolean isValid= PasswordEncoder.getUtils().compare(passwordInput, d.get().password());
            assertEquals(false, isValid);

        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
}
