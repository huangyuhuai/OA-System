package com.huang.oa.service;

import com.huang.oa.pojo.dto.AlterRequestDTO;
import com.huang.oa.pojo.dto.CheckDTO;
import com.huang.oa.pojo.dto.DepartmentRequestDTO;
import com.huang.oa.pojo.dto.LeaveRequestDTO;
import com.huang.oa.pojo.entity.WorkContent;
import com.huang.oa.pojo.vo.UserQueryVO;

import java.util.List;

public interface UserService {
    UserQueryVO query(int loginIdAsInt);

    List<WorkContent> getWorkContent(int loginIdAsInt);


    void request(DepartmentRequestDTO requestDTO);


    void check(CheckDTO checkDTO);

    void leaveRequest(LeaveRequestDTO requestDTO);

    void leaveCheck(CheckDTO checkDTO);

    void alterLeave(AlterRequestDTO alterDTO);
}