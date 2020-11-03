package com.juan.project.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.juan.project.vo.UserVo;

@Service("userService")
public interface UserService {
	
	// �α����� �����Ѵ�.
	Map<String, Object> selectUserLogin(Map<String, Object> mapParam);
	
	// ȸ�������� �����Ѵ�.
	int selecUserSign(UserVo userVo);
	
	// �α��� �� ����ڰ� �ִ����� üũ�Ѵ�.
	Map<String, Object> selectLoginCheck(Map<String, Object> mapParam);
	
	// ȸ������ �� ����ڰ� �ִ����� üũ�Ѵ�.
	Map<String, Object> selectSignCheck(Map<String, Object> mapParam);

}
