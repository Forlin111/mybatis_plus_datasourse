package com.example.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.mapper.ProductMapper;
import com.example.mybatisplus.pojo.Product;
import com.example.mybatisplus.service.ProductService;
import org.springframework.stereotype.Service;

@Service
@DS("slave_1")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
