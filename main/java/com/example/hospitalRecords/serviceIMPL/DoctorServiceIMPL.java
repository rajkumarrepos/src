package com.example.hospitalRecords.serviceIMPL;

import com.example.hospitalRecords.Exception.CustomException;
import com.example.hospitalRecords.Exception.ErrorCodes;
import com.example.hospitalRecords.daoInterface.DoctorDAO;
import com.example.hospitalRecords.entity.DoctorEntity;
import com.example.hospitalRecords.entity.DoctorPersonalDetailsEntity;
import com.example.hospitalRecords.entity.DoctorsAddressEntity;
import com.example.hospitalRecords.requestDTO.DoctorRegisterDTO;
import com.example.hospitalRecords.responseDTO.DoctorAddressResponseDTO;
import com.example.hospitalRecords.responseDTO.DoctorPersonalDetailsReposeDTO;
import com.example.hospitalRecords.responseDTO.DoctorResponseDTO;
import com.example.hospitalRecords.responseDTO.DoctorsFullListDTO;
import com.example.hospitalRecords.serviceInterface.DoctorAddressService;
import com.example.hospitalRecords.serviceInterface.DoctorService;
import com.example.hospitalRecords.serviceInterface.DoctorPersonalDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

@Slf4j
@Service
public class DoctorServiceIMPL implements DoctorService {
    @Autowired
    private DoctorPersonalDetailService doctorPersonalDetailService;
    @Autowired
    private DoctorAddressService doctorAddressService;
    @Autowired
    private DoctorDAO doctorDAO;
    @Override
    public DoctorResponseDTO addDetails(DoctorRegisterDTO doctorRegisterDTO){
        log.info(String.valueOf(doctorRegisterDTO));

        log.info(String.valueOf(doctorRegisterDTO.getDoctorPersonalDetailsRegisterDTO()));

        log.info(String.valueOf(doctorRegisterDTO.getDoctorAddressRegisterDTO()));
       if(doctorRegisterDTO.getRegId().toString().length()==12){
           DoctorPersonalDetailsEntity doctorPersonalDetailsEntity =doctorPersonalDetailService.register(doctorRegisterDTO.getDoctorPersonalDetailsRegisterDTO());

           DoctorsAddressEntity doctorsAddressEntity =doctorAddressService.register(doctorRegisterDTO.getDoctorAddressRegisterDTO());

           DoctorEntity doctorEntity = new DoctorEntity();
           BeanUtils.copyProperties(doctorRegisterDTO, doctorEntity);

           doctorEntity.setJoiningDate(LocalDateTime.now());
           doctorEntity.setDoctorPersonalDetailsEntity(doctorPersonalDetailsEntity);
           doctorEntity.setDoctorsAddressEntity(doctorsAddressEntity);
           log.info("doctorDesignation : {}", doctorEntity.toString());
           doctorDAO.saveInRepo(doctorEntity);

           DoctorPersonalDetailsReposeDTO doctorPersonalDetailsReposeDTO= new DoctorPersonalDetailsReposeDTO();
           BeanUtils.copyProperties(doctorPersonalDetailsEntity,doctorPersonalDetailsReposeDTO);

           DoctorAddressResponseDTO doctorAddressResponseDTO = new DoctorAddressResponseDTO();
           BeanUtils.copyProperties(doctorsAddressEntity,doctorAddressResponseDTO);

           DoctorResponseDTO doctorResponseDTO = new DoctorResponseDTO();
           BeanUtils.copyProperties(doctorEntity,doctorResponseDTO);

           doctorResponseDTO.setDoctorPersonalDetailsReposeDTO(doctorPersonalDetailsReposeDTO);

           doctorResponseDTO.setDoctorAddressResponseDTO(doctorAddressResponseDTO);



           return doctorResponseDTO;

       }
       else{
           throw new CustomException(ErrorCodes.CODE_602.name(), ErrorCodes.CODE_602.getMessage());
       }
    }

    public List<DoctorsFullListDTO> getAll(){
        List<DoctorEntity> doctorEntityList =doctorDAO.getAllDoctorsList();

        List<DoctorsFullListDTO> doctorsFullListDTOList = new ArrayList<>();



        for (DoctorEntity doctorEntity:doctorEntityList) {
            DoctorsFullListDTO doctorsFullListDTO = new DoctorsFullListDTO();
            DoctorAddressResponseDTO doctorAddressResponseDTO = new DoctorAddressResponseDTO();
            DoctorPersonalDetailsReposeDTO doctorPersonalDetailsReposeDTO= new DoctorPersonalDetailsReposeDTO();

            BeanUtils.copyProperties(doctorEntity,doctorsFullListDTO);
            BeanUtils.copyProperties(doctorEntity.getDoctorPersonalDetailsEntity(),doctorPersonalDetailsReposeDTO);
            BeanUtils.copyProperties(doctorEntity.getDoctorsAddressEntity(),doctorAddressResponseDTO);

            doctorsFullListDTO.setDoctorPersonalDetailsReposeDTO(doctorPersonalDetailsReposeDTO);
            doctorsFullListDTO.setDoctorAddressResponseDTO(doctorAddressResponseDTO);

            doctorsFullListDTOList.add(doctorsFullListDTO);
        }
        return doctorsFullListDTOList;
    }
    @Override
    public List<DoctorsFullListDTO> getAllDoctors(Pageable pageable) throws CustomException {
        Page<DoctorEntity> doctorEntityList =doctorDAO.getAllDoctorsPage(pageable);

        List<DoctorsFullListDTO> doctorsFullListDTOList = new ArrayList<>();



        for (DoctorEntity doctorEntity:doctorEntityList) {
            DoctorsFullListDTO doctorsFullListDTO = new DoctorsFullListDTO();
            DoctorAddressResponseDTO doctorAddressResponseDTO = new DoctorAddressResponseDTO();
            DoctorPersonalDetailsReposeDTO doctorPersonalDetailsReposeDTO= new DoctorPersonalDetailsReposeDTO();

            BeanUtils.copyProperties(doctorEntity,doctorsFullListDTO);
            BeanUtils.copyProperties(doctorEntity.getDoctorPersonalDetailsEntity(),doctorPersonalDetailsReposeDTO);
            BeanUtils.copyProperties(doctorEntity.getDoctorsAddressEntity(),doctorAddressResponseDTO);

            doctorsFullListDTO.setDoctorPersonalDetailsReposeDTO(doctorPersonalDetailsReposeDTO);
            doctorsFullListDTO.setDoctorAddressResponseDTO(doctorAddressResponseDTO);

            doctorsFullListDTOList.add(doctorsFullListDTO);
        }
        return doctorsFullListDTOList;
    }
}
