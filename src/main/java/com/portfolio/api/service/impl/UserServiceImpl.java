package com.portfolio.api.service.impl;

import com.portfolio.api.domain.User;
import com.portfolio.api.repository.UserRepository;
import com.portfolio.api.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends CommonServiceImpl<User, UserRepository> implements UserService {
}
