package com.firstSpring.dao;
 
import java.util.List;

import com.firstSpring.vo.MovieVO;
 
public interface MovieDAO {
    
    public List<MovieVO> selectMovie() throws Exception;
}