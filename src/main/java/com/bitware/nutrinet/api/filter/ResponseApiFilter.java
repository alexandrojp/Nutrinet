package com.bitware.nutrinet.api.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponseApiFilter implements Filter {

    private final static Logger LOG = LoggerFactory.getLogger(ResponseApiFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        chain.doFilter(request, response);
        LOG.error("Logging Response :{}", res.getOutputStream());
    }
}
