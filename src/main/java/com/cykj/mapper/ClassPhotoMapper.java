package com.cykj.mapper;

import com.cykj.bean.Photo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/24 13:25
 * @desc:
 */

@Repository
public interface ClassPhotoMapper {
    List<Photo> checkClassPhoto(int classId);
    int insertClassPhoto(Photo photo);
}
