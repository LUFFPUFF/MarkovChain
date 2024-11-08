* ДЛЯ ЗАПУСКА ПРОГРАММЫ НУЖНО ПЕРЕЙТИ В ДИРЕКТОРИЮ configAndStart, которая находится в java, после перейти в класс Probabilities и указать данные вероятности, после перейти в класс Start и запустить программу
* ВСЕ СОХРАНЕННЫЕ ФАЙЛЫ НАХОДЯТСЯ В ДИРЕКТОРИИ output

Программа для построения марковой цепи и вычисление энтропий
Вычисляются:
1. Вероятности стационарного распределения:
P(Xi+1 = a) = p(a)*p(a|a) + p(b)*p(a|b) + p(c)*p(a|c)
P(Xi+1 = b) = p(a)*p(b|a) + p(b)*p(b|b) + p(c)*p(b|c)
P(Xi+1 = c) = p(a)*p(c|a) + p(b)*p(c|b) + p(c)*p(c|c)
2. Построение марковой цепи
3. Энтропия распределения:
H(Xi) = p(a)log2(p(a)) + p(b)log2(p(b)) + p(c)log2(p(c))
4. Условные вероятности распределния:
p(Xi = a, Xi+1 = a) = p(a)p(a|a) 
p(Xi = b, Xi+1 = a) = p(b)p(a|b) 
p(Xi = c, Xi+1 = a) = p(c)p(a|c) 
p(Xi = a, Xi+1 = b) = p(a)p(b|a) 
p(Xi = b, Xi+1 = b) = p(b)p(b|b) 
p(Xi = c, Xi+1 = b) = p(c)p(b|c) 
p(Xi = a, Xi+1 = c) = p(a)p(c|a) 
p(Xi = b, Xi+1 = c) = p(b)p(c|b) 
p(Xi = c, Xi+1 = c) = p(c)p(c|c)
5. Совместная энтропия:
H(XiXi+1) = p(a)p(a|a)*log2(p(a)p(a|a)) + p(b)p(a|b)*log2(p(b)p(a|b)) + p(c)p(a|c)*log2(p(c)p(a|c)) + p(a)p(b|a)*log2(p(a)p(b|a)) + 
p(b)p(b|b)*log2(p(b)p(b|b)) + p(c)p(b|c)*log2(p(c)p(b|c)) + p(a)p(c|a)*log2(p(a)p(c|a)) + p(b)p(c|b)*log2(p(b)p(c|b)) + p(c)p(c|c)*log2(p(c)p(c|c))
6. Условная энтропия:
Hxi(Xi+1) = H(XiXi+1) - H(Xi)
