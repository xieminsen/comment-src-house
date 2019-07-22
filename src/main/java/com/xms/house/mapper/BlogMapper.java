package com.xms.house.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xms.house.model.Blog;
import com.xms.house.model.LimitOffset;


@Mapper
public interface BlogMapper {
  
  public List<Blog> selectBlog(@Param("blog") Blog blog, @Param("pageParams")LimitOffset limitOffset);
  
  public Long selectBlogCount(Blog query);

}
