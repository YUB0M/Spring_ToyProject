package org.zerock.service;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import java.util.List;

public interface BoardService {

    public void register(BoardVO board);

    public BoardVO get(long bno);

    public boolean modify(BoardVO board);

    public boolean remove(long bno);

    //public List<BoardVO> getList();

    public List<BoardVO> getList(Criteria cri);

    public int getTotal(Criteria cri);

}
