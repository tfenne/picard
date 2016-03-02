/*
 * The MIT License
 *
 * Copyright (c) 2015 The Broad Institute
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package picard.analysis;

import picard.cmdline.CommandLineProgramProperties;
import picard.cmdline.programgroups.Alpha;

/**
 * Computes a number of metrics that are useful for evaluating coverage and performance of whole genome sequencing experiments,
 * but only at a set of sampled positions.
 * It is important that the sampled positions be chosen so that they are spread out at least further than a read's length apart;
 * otherwise, you run the risk of double-counting reads in the metrics.
 *
 * @author ebanks
 */
@CommandLineProgramProperties(
        usage = "Computes a number of metrics that are useful for evaluating coverage and performance of " +
                "whole genome sequencing experiments, but only at a set of sampled positions.  " +
                "It is important that the sampled positions be chosen so that they are spread out " +
                "at least further than a read's length apart; otherwise, you run the risk of double-counting " +
                "reads in the metrics.",
        usageShort = "Writes whole genome sequencing-related metrics for a SAM or BAM file",
        programGroup = Alpha.class
)
@Deprecated // use CollectWgsMetrics with INTERVALS argument instead
public class CollectWgsMetricsFromSampledSites extends CollectWgsMetrics {}
