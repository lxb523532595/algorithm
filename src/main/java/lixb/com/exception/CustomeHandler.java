package lixb.com.exception;

import lixb.com.myproject.entity.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;


@ControllerAdvice
public class CustomeHandler implements ResponseBodyAdvice<Object>{
	
	public Logger logger = LoggerFactory.getLogger(getClass());
	 @ExceptionHandler(value = BindException.class)
	 @ResponseBody
	 public BaseResult<Object> handler(BindException e){
		 BaseResult<Object> result = new BaseResult<>();
		 String message = e.getAllErrors().get(0).getDefaultMessage();
		 result.setCode(1000);
		 result.setMessage(message);
		 logger.error(message,e);
		 return result;
	 }
	 
	 @ExceptionHandler(value = MethodArgumentNotValidException.class)
	 @ResponseBody
	 public BaseResult<Object> handler(MethodArgumentNotValidException e){
		 String message = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();
		 BaseResult<Object> result = new BaseResult<>();
		 result.setCode(1000);
		 result.setMessage(message);
		 logger.error(message,e);
		 return result;
	 }

//	 @ExceptionHandler(value =BusinessException.class)
//	 @ResponseBody
//	 public DreamResponseEntity handler(BusinessException e){
//		 String message = e.getMessage();
//		 logger.error(message,e);
//		 return DreamResponseEntity.error(message);
//	 }

	@Override
	public boolean supports(MethodParameter returnType,
			Class<? extends HttpMessageConverter<?>> converterType) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType,
			MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType,
			ServerHttpRequest request, ServerHttpResponse response) {
		BaseResult<Object> result = new BaseResult<>();
		result.setCode(1000);
		result.setData(body);
		return body;
	}
}
