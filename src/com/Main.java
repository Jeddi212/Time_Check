package com;

import com.Rotate.RotateThread1;
import com.Rotate.RotateThread2;

import static com.Detect.ObjDetect.*;
import static com.Rotate.RotateImage.*;

public class Main {

    // GLOBAL VARIABLE
    static int N = 1000;

    static int[] larr10 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    static int[] larr100 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

    static int[] larr1000 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 524, 525, 526, 527, 528, 529, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 540, 541, 542, 543, 544, 545, 546, 547, 548, 549, 550, 551, 552, 553, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584, 585, 586, 587, 588, 589, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606, 607, 608, 609, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 625, 626, 627, 628, 629, 630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659, 660, 661, 662, 663, 664, 665, 666, 667, 668, 669, 670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 686, 687, 688, 689, 690, 691, 692, 693, 694, 695, 696, 697, 698, 699, 700, 701, 702, 703, 704, 705, 706, 707, 708, 709, 710, 711, 712, 713, 714, 715, 716, 717, 718, 719, 720, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 731, 732, 733, 734, 735, 736, 737, 738, 739, 740, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751, 752, 753, 754, 755, 756, 757, 758, 759, 760, 761, 762, 763, 764, 765, 766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827, 828, 829, 830, 831, 832, 833, 834, 835, 836, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 851, 852, 853, 854, 855, 856, 857, 858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870, 871, 872, 873, 874, 875, 876, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 896, 897, 898, 899, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999};

    static int[] arr10 = {928, 800, 388, 5, 140, 922, 704, 390, 867, 424};

    static int[] arr100 = {674, 881, 351, 383, 581, 650, 895, 8, 985, 296, 396, 142, 709, 678, 220, 127, 312, 702, 819, 235, 371, 188, 77, 40, 671, 124, 990, 968, 569, 813, 236, 481, 498, 321, 305, 186, 21, 259, 841, 117, 362, 136, 662, 195, 912, 847, 418, 279, 886, 73, 251, 51, 558, 832, 883, 934, 815, 480, 437, 133, 696, 478, 134, 938, 885, 239, 389, 407, 138, 619, 471, 205, 581, 280, 527, 940, 702, 98, 316, 351, 894, 505, 545, 233, 551, 1, 122, 528, 473, 991, 862, 715, 36, 600, 821, 424, 921, 901, 745, 971};

    static int[] arr1000 = {133, 377, 943, 487, 95, 951, 293, 147, 737, 709, 725, 573, 231, 812, 230, 625, 80, 21, 256, 274, 562, 106, 904, 375, 581, 154, 411, 892, 757, 549, 523, 109, 713, 606, 289, 365, 55, 37, 119, 496, 519, 884, 175, 335, 35, 946, 87, 524, 854, 44, 707, 331, 420, 500, 440, 708, 351, 299, 694, 613, 271, 392, 439, 901, 901, 203, 984, 32, 300, 446, 350, 618, 549, 882, 760, 814, 825, 676, 332, 894, 169, 31, 370, 86, 289, 103, 640, 656, 68, 659, 88, 431, 733, 153, 693, 260, 889, 56, 313, 623, 914, 458, 121, 834, 743, 373, 66, 982, 780, 165, 273, 87, 6, 511, 431, 929, 965, 18, 90, 664, 253, 940, 478, 678, 839, 14, 975, 437, 25, 23, 437, 821, 585, 679, 342, 338, 855, 885, 408, 320, 563, 843, 589, 452, 616, 969, 534, 244, 461, 759, 770, 738, 223, 230, 115, 272, 923, 480, 95, 155, 568, 587, 849, 826, 612, 274, 110, 595, 67, 238, 294, 406, 299, 634, 620, 697, 726, 493, 794, 605, 288, 625, 512, 9, 841, 438, 595, 287, 381, 809, 359, 535, 330, 262, 284, 120, 759, 330, 358, 469, 923, 670, 643, 934, 622, 346, 860, 181, 702, 753, 223, 768, 663, 211, 399, 887, 751, 975, 813, 385, 223, 143, 58, 606, 558, 806, 854, 526, 676, 214, 290, 552, 83, 305, 611, 254, 510, 492, 597, 843, 616, 351, 825, 60, 685, 842, 407, 354, 73, 650, 616, 767, 910, 187, 568, 722, 660, 482, 512, 766, 555, 759, 161, 837, 913, 283, 951, 176, 717, 343, 467, 599, 384, 936, 204, 561, 103, 954, 473, 266, 21, 859, 165, 867, 184, 363, 459, 16, 239, 393, 452, 220, 465, 506, 508, 487, 176, 805, 511, 71, 986, 126, 405, 521, 577, 410, 147, 439, 834, 542, 143, 345, 307, 423, 228, 833, 279, 874, 390, 356, 160, 379, 190, 91, 71, 420, 789, 856, 33, 782, 31, 74, 197, 600, 910, 205, 889, 587, 808, 305, 274, 657, 671, 683, 636, 861, 730, 515, 589, 995, 777, 618, 716, 39, 550, 549, 665, 982, 278, 816, 160, 406, 133, 740, 914, 796, 394, 793, 955, 140, 514, 189, 556, 946, 239, 792, 484, 992, 884, 97, 683, 404, 892, 47, 7, 297, 733, 294, 827, 583, 568, 285, 353, 402, 956, 401, 207, 844, 205, 697, 786, 841, 667, 516, 439, 434, 535, 954, 661, 24, 134, 452, 299, 220, 460, 567, 362, 519, 959, 80, 28, 344, 228, 838, 795, 188, 849, 193, 694, 407, 861, 521, 391, 152, 872, 679, 196, 134, 941, 821, 109, 509, 127, 375, 632, 642, 558, 580, 443, 424, 654, 309, 90, 155, 643, 78, 524, 719, 36, 160, 308, 79, 941, 635, 902, 556, 228, 136, 488, 89, 216, 192, 884, 282, 732, 513, 488, 348, 921, 690, 442, 498, 514, 18, 363, 123, 170, 773, 26, 103, 694, 814, 642, 228, 93, 966, 871, 228, 888, 680, 740, 477, 256, 846, 945, 806, 354, 503, 320, 404, 582, 779, 8, 718, 869, 131, 163, 855, 189, 984, 541, 0, 90, 221, 554, 235, 490, 530, 409, 684, 186, 926, 968, 741, 235, 185, 38, 68, 321, 961, 783, 394, 959, 784, 837, 9, 621, 634, 641, 194, 980, 177, 314, 805, 301, 89, 558, 182, 621, 727, 128, 196, 142, 517, 277, 616, 232, 633, 711, 619, 115, 714, 473, 800, 718, 737, 268, 113, 937, 104, 140, 201, 329, 563, 541, 133, 245, 636, 697, 945, 553, 637, 222, 431, 197, 411, 433, 330, 370, 5, 854, 504, 72, 928, 888, 383, 369, 732, 510, 596, 388, 961, 169, 508, 440, 999, 91, 808, 580, 590, 271, 148, 668, 101, 770, 224, 19, 709, 80, 524, 849, 276, 362, 485, 162, 170, 125, 530, 269, 323, 917, 331, 977, 355, 697, 582, 716, 267, 221, 808, 485, 383, 372, 646, 761, 821, 840, 985, 960, 45, 486, 56, 661, 836, 279, 174, 476, 611, 286, 930, 397, 361, 663, 303, 381, 699, 795, 574, 728, 853, 823, 789, 806, 176, 702, 112, 222, 523, 148, 760, 476, 293, 446, 795, 800, 117, 70, 81, 21, 647, 884, 222, 383, 803, 975, 853, 87, 862, 541, 817, 539, 867, 270, 406, 409, 264, 606, 838, 43, 424, 947, 43, 412, 722, 395, 75, 356, 754, 307, 257, 712, 281, 301, 683, 319, 670, 482, 180, 632, 63, 511, 846, 680, 747, 470, 80, 217, 409, 661, 884, 269, 262, 763, 481, 680, 247, 199, 43, 631, 585, 511, 908, 31, 967, 282, 765, 114, 981, 719, 832, 1000, 0, 151, 287, 128, 1, 975, 807, 683, 31, 939, 666, 948, 68, 214, 469, 522, 355, 46, 74, 556, 835, 358, 517, 809, 643, 362, 678, 902, 785, 7, 22, 122, 728, 338, 622, 315, 552, 14, 146, 197, 882, 299, 290, 514, 599, 117, 332, 604, 944, 692, 562, 415, 741, 712, 95, 983, 182, 20, 924, 130, 814, 552, 211, 100, 511, 454, 472, 58, 829, 685, 151, 939, 703, 692, 874, 482, 363, 934, 989, 584, 94, 250, 497, 809, 787, 716, 533, 708, 834, 635, 510, 501, 207, 361, 793, 294, 430, 307, 52, 903, 375, 504, 12, 904, 133, 845, 791, 851, 386, 525, 843, 253, 283, 618, 614, 587, 322, 337, 55, 445, 779, 449, 871, 66, 891, 519, 444, 428, 435, 676, 443, 544, 497, 511, 294, 876, 135, 754, 554, 697, 999, 863, 871, 776, 265, 683, 393, 302, 944, 547, 940, 279, 811, 982, 406, 976, 95, 475, 11, 79, 370, 266, 190, 704, 156, 375, 65, 863, 61, 303, 138, 937, 745, 669, 780, 857, 228, 39, 361, 503, 288, 266, 357, 284, 271, 436, 442, 877, 172, 579, 867, 165, 897, 968, 577, 267, 895, 850, 138, 803, 738, 795, 215, 468, 592, 986, 644, 189, 824, 828, 36, 586, 342, 946, 580, 803, 269, 704, 671, 547, 28, 424, 443, 908, 804, 35, 853, 407, 10};

    static
    int[][] rarr2 = {
            {1,1},
            {2,2},
    };

    static
    int[][] rarr3 = {
            {1,1,1},
            {2,2,2},
            {3,3,3},
    };

    static
    int[][] rarr4 = {
            {1,1,1,1},
            {2,2,2,2},
            {3,3,3,3},
            {4,4,4,4},
    };

    static
    int[][] rarr5 = {
            {1,1,1,1,1},
            {2,2,2,2,2},
            {3,3,3,3,3},
            {4,4,4,4,4},
            {5,5,5,5,5},
    };

    static
    int[][] rarr6 = {
            {1,1,1,1,1,1},
            {2,2,2,2,2,2},
            {3,3,3,3,3,3},
            {4,4,4,4,4,4},
            {5,5,5,5,5,5},
            {6,6,6,6,6,6},
    };

    static
    int[][] rarr7 = {
            {1,1,1,1,1,1,1},
            {2,2,2,2,2,2,2},
            {3,3,3,3,3,3,3},
            {4,4,4,4,4,4,4},
            {5,5,5,5,5,5,5},
            {6,6,6,6,6,6,6},
            {7,7,7,7,7,7,7},
    };

    static
    int[][] rarr8 = {
            {1,1,1,1,1,1,1,1},
            {2,2,2,2,2,2,2,2},
            {3,3,3,3,3,3,3,3},
            {4,4,4,4,4,4,4,4},
            {5,5,5,5,5,5,5,5},
            {6,6,6,6,6,6,6,6},
            {7,7,7,7,7,7,7,7},
            {8,8,8,8,8,8,8,8},
    };

    public static
    int[][] rarr9 = {
            {1,1,1,1,1,1,1,1,1},
            {2,2,2,2,2,2,2,2,2},
            {3,3,3,3,3,3,3,3,3},
            {4,4,4,4,4,4,4,4,4},
            {5,5,5,5,5,5,5,5,5},
            {6,6,6,6,6,6,6,6,6},
            {7,7,7,7,7,7,7,7,7},
            {8,8,8,8,8,8,8,8,8},
            {9,9,9,9,9,9,9,9,9},
    };

    public static int [][] rarr10 = new int [10][10];
    public static int [][] rarr100 = new int [100][100];
    public static int [][] rarr1000 = new int [1000][1000];

    static
    int[][] rarr92 = {
            {1,1},
            {2,2},
            {3,3},
            {4,4},
            {5,5},
            {6,6},
            {7,7},
            {8,8},
            {9,9},
    };

    static
    int[][] rarr98 = {
            {1,1,1,1,1,1,1,1},
            {2,2,2,2,2,2,2,2},
            {3,3,3,3,3,3,3,3},
            {4,4,4,4,4,4,4,4},
            {5,5,5,5,5,5,5,5},
            {6,6,6,6,6,6,6,6},
            {7,7,7,7,7,7,7,7},
            {8,8,8,8,8,8,8,8},
            {9,9,9,9,9,9,9,9},
    };

    static
    int[][] warr4 = {
            {1,1,1,1},
            {1,0,0,1},
            {1,0,0,1},
            {1,1,1,1},
    };

    static
    int[][] warr9 = {
            {1,1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,1,1},
            {1,0,0,0,0,0,1,0,1},
            {1,0,0,0,0,1,0,0,1},
            {1,0,0,0,1,0,0,0,1},
            {1,0,0,1,0,0,0,0,1},
            {1,0,1,0,0,0,0,0,1},
            {1,1,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1,1},
    };

    static
    int[][] warr1 = {
            {1, 1, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 0, 1, 1, 0}
    };

    static
    int[][] warr2 = {
            {0, 0, 0, 0, 1, 0},
            {0, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };

    static
    int[][] warr21 = {
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };

    static
    int[][] warr3 = {
            {0, 0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1, 0},
            {1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };

    static
    int[][] warr5 = {
            {0, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 1, 1},
            {0, 0, 0, 0, 0, 0}
    };

    static
    int[][] warr6 = {
            {0, 0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };

    static
    int[][] warr7 = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };

    static
    int[][] warr71 = {
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };

    static
    int[][] warr72 = {
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 1, 1},
            {0, 0, 0, 0, 1, 1},
            {0, 0, 0, 0, 1, 1},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };

    static
    int[][] warr73 = {
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };

    static
    int[][] warr74 = {
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };

    static
    int[][] warr75 = {
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1},
            {0, 0, 0, 1, 1, 1}
    };

    static
    int[][] warr8 = {
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0, 1},
            {1, 0, 0, 1, 0, 1},
            {1, 0, 0, 1, 0, 1},
            {1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0}
    };

    static
    int[][] warr11 = {
            {1, 1, 0, 1, 0, 0}, /*total objects 5*/
            {0, 0, 0, 1, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 0, 1, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {1, 1, 0, 1, 1, 0}
    };

    static
    int[][] warr12 = {
            {1, 1, 0, 1, 0, 0}, /*total objects 6*/
            {0, 0, 0, 1, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 0, 1, 1, 0}
    };

    static
    int[][] warr13 = {
            {1, 0}, /*total objects 2*/
            {0, 1}
    };

    static
    int[][] warr14 = {
            {1, 0, 1}, /*total objects 3*/
            {0, 1, 0},
            {1, 1, 0}
    };

    static
    int[][] warr15 = {
            {1, 0, 1, 0, 1, 0}, /*total objects 21*/
            {0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0}
    };

//    static
//    int[][] rarr10 = {
//            {2 ,2 ,1 ,1 ,2 ,2 ,1 ,2 ,1 ,2},
//            {0 ,2 ,2 ,1 ,2 ,2 ,1 ,2 ,1 ,2},
//            {0 ,0 ,2 ,1 ,1 ,1 ,2 ,1 ,2 ,2},
//            {0 ,0 ,0 ,1 ,2 ,2 ,2 ,1 ,2 ,1},
//            {0 ,0 ,0 ,0 ,1 ,2 ,1 ,2 ,2 ,2},
//            {0 ,0 ,0 ,0 ,0 ,1 ,1 ,2 ,2 ,2},
//            {0 ,0 ,0 ,0 ,0 ,0 ,1 ,2 ,1 ,2},
//            {0 ,0 ,0 ,0 ,0 ,0 ,0 ,1 ,1 ,2},
//            {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,2 ,1},
//            {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,1}
//    };

    // PRINT MEMORY USAGE
    private static void printMemory() {
        // Get the Java runtime
        Runtime runtime = Runtime.getRuntime();
        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
    }

    // PSV MAIN
    public static void main(String[] args) {

        // GENERATE ARRAY 1000
        for (int k=0;k<1000;k++) {
            for (int l=0;l<1000;l++) {
                rarr1000[k][l] = k+1;
            }
        }

        // GENERATE ARRAY 100
        for (int k=0;k<100;k++) {
            for (int l=0;l<100;l++) {
                rarr100[k][l] = k+1;
            }
        }

        // GENERATE ARRAY 10
        for (int k=0;k<10;k++) {
            for (int l=0;l<10;l++) {
                rarr10[k][l] = k+1;
            }
        }

        // FOR
        /*checkFOR();*/

        // WHILE
        /*checkWhile();*/
        /*printMemory();*/

        // RECURSIVE
        /*checkRecursive();*/

        //SELECTION SORT
        /*checkSelectionSort(N, arr1000);*/

        // BUBBLE SORT
        /*checkBubbleSort(N, arr1000);*/

        // INSERTION SORT
        /*checkInsertionSort(N, arr1000);*/

        // HEAP SORT
        /*checkHeapSort(N, arr1000);*/

        // QUICK SORT
        /*checkQuickSort(N, arr1000);*/

        // MERGE SORT
        /*checkMergeSort(N, arr1000);*/

        // BUCKET SORT
        /*checkBucketSort(N);*/

        // RADIX SORT
        /*checkRadixSort(N, arr1000);*/

        // BINARY SEARCH
        /*checkBinarySearch(N, larr1000, 0);*/

        // JUMP SEARCH
        /*checkJumpSearch(N, larr1000, 0);*/

        // DEPTH FIRST SEARCH
        /*checkDFS(N);*/

        // BREADTH FIRST SEARCH
        /*checkBFS(N);*/

        // OBJECT DETECT ARRAY
        /*objDetect(warr8);
        objKel3(warr1);

        checkKel1(N, warr15);
        System.out.println();

        checkKel3(N, warr15);
        System.out.println();*/

        // ROTATE IMAGE
        /*printArr(rarr9);
        System.out.println();

        checkRotateKanan(N, rarr9);
        System.out.println();
        printArr(clockwise(rarr9));

        printArr(rotateKel2Kanan(rarr9));
        System.out.println();

        printArr(rotateKel2Kiri(rarr92));
        System.out.println();*/

        // CYCLE SWAPPING
        /*checkClockwise(N, rarr9);
        checkClockwise(N, rarr10);
        checkClockwise(N, rarr100);
        checkClockwise(N, rarr1000);*/

        // THREAD KEL 3
        checkRotateKel3(N, rarr9);
        checkRotateKel3(N, rarr10);
        checkRotateKel3(N, rarr100);
        checkRotateKel3(N, rarr1000);
    }

}
