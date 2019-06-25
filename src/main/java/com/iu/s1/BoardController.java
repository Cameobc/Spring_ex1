package com.iu.s1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.board.BoardVO;

@Controller
@RequestMapping(value = "/board/**") //board/test/boardWrite 도 받아주자. **:패키지 포함 하위 모든 것들
public class BoardController {
	
	@RequestMapping(value = "boardSelect", method = RequestMethod.GET)
	public ModelAndView boardSelect(int num, ModelAndView mv) {
		//파라미터이름이 num인 것을 맵핑'
		System.out.println(num);
		mv.addObject("num", num);
		mv.setViewName("board/boardSelect");
		return mv;
	}

	@RequestMapping(value = "boardWrite", method =  RequestMethod.POST)
	public String boardWrite2(BoardVO boardVO) {
		/* 아래의 코드를 대신 쳐주는 것이라 기본값이 들어간다. reference = null, primitive 는 각각의 기본값.
		BoardVO boardVO2 = new BoardVO();*/
		//리다이렉트로 보낼것. 루트로 가도록.
		System.out.println(boardVO.getNum());
		System.out.println(boardVO.getTitle());
		System.out.println(boardVO.getWriter());
		System.out.println(boardVO.getContents());
		return "redirect:../";
	}
	@RequestMapping(value = "boardWrite", method = RequestMethod.GET)
	public String boardWrite(HttpSession session) {
		return "board/boardWrite";
	}
	
	@RequestMapping(value = "boardList", method = RequestMethod.GET) // 무조건 절대경로로 적어줘야 한다.
	//model 은 request와 같은 영역이라 request를 대체함.
	//void 로 되어있으면 url 주소가 view의 이름으로 매핑된다. 즉, board/boardList
	//리턴이 model 일 때도 void와 같은 효과.
	public Model boardList(Model model) {
		String result = "Change";
		String result2 = "Another Data";
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("abcd");
		model.addAttribute("result", result);
		model.addAttribute(boardVO);
		return model;
	}
}
