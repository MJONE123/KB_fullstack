SELECT * FROM dept_emp AS a 
INNER JOIN employees AS b -- JOIN이라고 써도 디폴트값이 INNER JOIN이다.
ON a.emp_no = b.emp_no;
-- WHERE b.gender = 'M'-- membertbl