package com.poc.cluster.controller;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/cspoc", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "/cspoc", description = "API to handle cluster operations")
public class ClusterController {
}
