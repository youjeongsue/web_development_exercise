package com.firstSpring.service;

import java.util.List;

import com.firstSpring.vo.MovieVO;
 
public interface MovieService {
    
    public List<MovieVO> selectMovie() throws Exception;
}