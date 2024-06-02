package in.ashokit.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImp implements BookDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;

	}
     @Override
	public boolean save() {
		String sql = "delete from  book where book_id=2";
		jdbcTemplate.execute(sql);

		return true;
	}

}
