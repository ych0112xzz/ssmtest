package com.gtja.finance.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



public interface UserService {
    List<Map<String, Object>> listUsers();

}
