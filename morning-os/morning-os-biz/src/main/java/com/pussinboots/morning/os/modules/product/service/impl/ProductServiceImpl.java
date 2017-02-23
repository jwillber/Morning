package com.pussinboots.morning.os.modules.product.service.impl;

import com.pussinboots.morning.os.modules.product.entity.Product;
import com.pussinboots.morning.os.modules.product.mapper.ProductMapper;
import com.pussinboots.morning.os.modules.product.service.IProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 
* 项目名称：morning-os-biz   
* 类名称：ProductServiceImpl   
* 类描述：ProductServiceImpl表 / 商品表 业务逻辑层接口实现类            
* 创建人：陈星星   
* 创建时间：2017年2月23日 下午3:48:45   
*
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {
	
}