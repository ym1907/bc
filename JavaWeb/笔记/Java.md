### 保留小数点后

Float Time = 5.592519;
DecimalFormat tt = new DecimalFormat("#.###");//设置小数点保留几位
highTemp2Time = Float.parseFloat(tt.format(Time));

