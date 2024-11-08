package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Request;
import com.example.demo.Repository.RequestRepository;

@Service
public class RequestService {
	@Autowired
    private RequestRepository requestRepository;

    public Request submitRequest(Request request) {
        request.setStatus("Pending");
        return requestRepository.save(request);
    }

    public List<Request> getPendingRequests() {
        return requestRepository.findByStatus("Pending");
    }

    public Request updateRequestStatus(Long id, String status) {
        Request request = requestRepository.findById(id).orElseThrow();
        request.setStatus(status);
        return requestRepository.save(request);
    }
}
