package com.cykj.service.impl;

import com.cykj.bean.Photo;
import com.cykj.mapper.ClassPhotoMapper;
import com.cykj.service.ClassPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/8/8 22:09
 * @desc:
 */

@Service
public class ClassPhotoServiceImpl implements ClassPhotoService {
    @Autowired
    private ClassPhotoMapper photoMapper;

    @Override
    public List<Photo> checkClassPhoto(int classId) {
        List<Photo> photos = photoMapper.checkClassPhoto(classId);
        if (!photos.isEmpty()) {
            return photos;
        }
        return null;
    }

    @Override
    public String insertClassPhoto(Photo photo) {
        int i = photoMapper.insertClassPhoto(photo);
        if (i > 0) {
            return "新增成功";
        }
        return "新增失败";
    }
}
