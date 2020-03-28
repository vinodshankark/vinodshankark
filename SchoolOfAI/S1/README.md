# S1 Questions

## What are Channels and Kernels (according to EVA)?
* Channels are containers of similar information. Image may have many channels based on color or curves etc. Music concert may have different channels like guitar, violin, keyboard, drum, etcKernal is a feature extractor. 
* Kernal is used for identifying features from channel or image. Kernal creates feature map which will identify the feature.
#

## Why should we (nearly) always use 3x3 kernels?
* For 5x5 of 25 parameters, 5x5 kernel can be made by 3x3 kernel 2 times i.e 18 variables
* For 7x7 of 49 parameters, 7x7 kernel can be made by 3x3 kernel 3 times i.e 27 variables
* 2x2 is difficult to identify the feature. Curves are difficult to identify.
#

## How many times to we need to perform 3x3 convolutions operations to reach close to 1x1 from 199x199 (type each layer output like 199x199 > 197x197...)
* 99 times we need to perform 3*3 convolutions operations to reach 1*1
```
199*199 -> 197*197
197*197 -> 195*195
195*195 -> 193*193
193*193 -> 191*191
191*191 -> 189*189
189*189 -> 187*187
187*187 -> 185*185
185*185 -> 183*183
183*183 -> 181*181
181*181 -> 179*179
179*179 -> 177*177
177*177 -> 175*175
175*175 -> 173*173
173*173 -> 171*171
171*171 -> 169*169
169*169 -> 167*167
167*167 -> 165*165
165*165 -> 163*163
163*163 -> 161*161
161*161 -> 159*159
159*159 -> 157*157
157*157 -> 155*155
155*155 -> 153*153
153*153 -> 151*151
151*151 -> 149*149
149*149 -> 147*147
147*147 -> 145*145
145*145 -> 143*143
143*143 -> 141*141
141*141 -> 139*139
139*139 -> 137*137
137*137 -> 135*135
135*135 -> 133*133
133*133 -> 131*131
131*131 -> 129*129
129*129 -> 127*127
127*127 -> 125*125
125*125 -> 123*123
123*123 -> 121*121
121*121 -> 119*119
119*119 -> 117*117
117*117 -> 115*115
115*115 -> 113*113
113*113 -> 111*111
111*111 -> 109*109
109*109 -> 107*107
107*107 -> 105*105
105*105 -> 103*103
103*103 -> 101*101
101*101 -> 99*99
99*99 -> 97*97
97*97 -> 95*95
95*95 -> 93*93
93*93 -> 91*91
91*91 -> 89*89
89*89 -> 87*87
87*87 -> 85*85
85*85 -> 83*83
83*83 -> 81*81
81*81 -> 79*79
79*79 -> 77*77
77*77 -> 75*75
75*75 -> 73*73
73*73 -> 71*71
71*71 -> 69*69
69*69 -> 67*67
67*67 -> 65*65
65*65 -> 63*63
63*63 -> 61*61
61*61 -> 59*59
59*59 -> 57*57
57*57 -> 55*55
55*55 -> 53*53
53*53 -> 51*51
51*51 -> 49*49
49*49 -> 47*47
47*47 -> 45*45
45*45 -> 43*43
43*43 -> 41*41
41*41 -> 39*39
39*39 -> 37*37
37*37 -> 35*35
35*35 -> 33*33
33*33 -> 31*31
31*31 -> 29*29
29*29 -> 27*27
27*27 -> 25*25
25*25 -> 23*23
23*23 -> 21*21
21*21 -> 19*19
19*19 -> 17*17
17*17 -> 15*15
15*15 -> 13*13
13*13 -> 11*11
11*11 -> 9*9
9*9 -> 7*7
7*7 -> 5*5
5*5 -> 3*3
3*3 -> 1*1
```
#

## How are kernels initialized? 
* Kernels are initialized with random values. Even though kernels are initialized with random values it will arrive at the right values during training.
#

## What happens during the training of a DNN?
* During the training of DNN, the kernels which are initialized with random values will arrive at almost correct values which will do prediction. From this, the network is able to predict what is there in an image.
* But this can be done by breaking the image into individual components. But this breaking of an image is done using the feature. This is done by the kernel which is initialized with random values.
* When the network is doing the training these randomly initialized values are turned into correct value.

#