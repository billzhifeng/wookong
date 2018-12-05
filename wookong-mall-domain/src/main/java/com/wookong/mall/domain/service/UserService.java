package com.wookong.mall.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.wookong.mall.common.dto.UserReciveAddressDTO;
import com.wookong.mall.dal.dao.UserReciveAddressDOMapper;
import com.wookong.mall.dal.dataobject.UserReciveAddressDO;
import com.wookong.mall.dal.dataobject.UserReciveAddressDOExample;

@Service
public class UserService {
	@Autowired
	private UserReciveAddressDOMapper addressDao;
	
	public List<UserReciveAddressDTO> queryUserReceiveAddress(Long userId) {
		
		UserReciveAddressDOExample example = new UserReciveAddressDOExample();
		
        UserReciveAddressDOExample.Criteria cri = example.createCriteria();
        
        cri.andUserIdEqualTo(userId.toString());
        
        List<UserReciveAddressDO> dos = addressDao.selectByExample(example);
        
        List<UserReciveAddressDTO> list = new ArrayList<UserReciveAddressDTO>();
		
        if(!CollectionUtils.isEmpty(dos)){
            for(UserReciveAddressDO su:dos){
                list.add(convertToDTO(su));
            }
        }
        
        return list;
	}
	
	
	 private UserReciveAddressDTO convertToDTO(UserReciveAddressDO adr){
		 UserReciveAddressDTO adro = new UserReciveAddressDTO();
	        BeanUtils.copyProperties(adr, adro);
	        return adro;
	    }
	
}

