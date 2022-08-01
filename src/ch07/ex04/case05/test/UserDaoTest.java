package ch07.ex04.case05.test;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;

public class UserDaoTest {
	public static void main(String[] args) {
		// fixture : 테스트용 데이터
		Score socre1 = new Score(100, 100, 100);
		Score socre2 = new Score(10, 10, 10);
		
		Score[] scores = new Score[2];
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		
		scoreDao.insertScore(socre1);
		scoreDao.insertScore(socre2);
	}
}
