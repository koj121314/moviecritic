package org.js.movie.movieinfo.service;

import java.util.List;

import javax.inject.Inject;

import org.js.movie.movieinfo.dao.MovieInfoDAO;
import org.js.movie.movieinfo.domain.MovieInfoVO;
import org.springframework.stereotype.Service;

@Service("MovieInfoService")
public class MovieInfoServiceImpl implements MovieInfoService {

	@Inject
	private MovieInfoDAO dao;
	
	
	@Override
	public List<MovieInfoVO> list() {

		return dao.list();
	}
	
	@Override
	public MovieInfoVO view(int movieId) {
		
		return dao.view(movieId);
	}
	
	@Override
	public void write(MovieInfoVO vo) {
		dao.write(vo);
	}

	@Override
	public List<MovieInfoVO> searchByGenre(String genre) {
		
		return dao.searchByGenre(genre);
	}
}
