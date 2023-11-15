package com.codeworld.springsecurity.service;

import io.jsonwebtoken.Claims;

public interface JwtService {
     String extractUsername(String jwtToken);

}
