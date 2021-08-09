package com.cykj.service;

import com.cykj.bean.Photo;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/8 22:08
 * @desc:
 */
public interface ClassPhotoService {
    List<Photo> checkClassPhoto(int classId);
    String insertClassPhoto(Photo photo);

}
