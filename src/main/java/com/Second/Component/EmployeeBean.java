package com.Second.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int eid;
    private String ename;

    @Autowired
    private DepartmentBean deptBean; // Autowired using field injection

    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    // Default constructor
    public EmployeeBean() {}

    // Constructor-based Autowiring
    @Autowired
    public EmployeeBean(DepartmentBean deptBean) {
        logger.trace("*** Autowiring by using @Autowire annotation on constructor ***");
        this.deptBean = deptBean;
    }

    // Getter and Setter methods for eid and ename
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    // Setter for deptBean (autowired method)
    @Autowired
    public void setDeptBean(DepartmentBean deptBean) {
        logger.trace("*** Autowiring by using @Autowire annotation on Setter ***");
        this.deptBean = deptBean;
    }

    // Method to display employee details
    public void showEmployeeDetails() {
        logger.debug("Employee Id: {}", eid);
        logger.debug("Employee Name: {}", ename);
        deptBean.setDeptName("Information Technology");

        logger.debug("Department: {}", deptBean.getDeptName());
    }
}
