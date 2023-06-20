#!/usr/bin/perl

# Food for the Future

# This Perl script aims to create a sustainable food system through automation
# and efficient resource planning.

# Initialize libraries
use strict;
use warnings;

# Define global variables
my ($count, $ingredients, $recipes);

# Read ingredients and recipes from file
open (my $file, "<", "foods.txt") || die "Could not open file: $!";
$count = 0;
while (my $line = <$file>) {
	if ($count == 0) {
		$ingredients = $line;
	} elsif ($count == 1) {
		$recipes = $line;
	}
	$count++;
}
close $file;

# Parse ingredients and recipes
my @ingredients = split(' ',$ingredients);
my @recipes = split(' ',$recipes);

# Calculate optimal amounts
my %amounts;
foreach my $ingredient (@ingredients) {
	$amounts{$ingredient} = 0;
}
foreach my $recipe (@recipes) {
	my @recipeIngredients = split('-',$recipe);
	my $max = 0;
	foreach my $recipeIngredient (@recipeIngredients) {
		if ($amounts{$recipeIngredient} > $max) {
			$max = $amounts{$recipeIngredient};
		}
	}
	foreach my $recipeIngredient (@recipeIngredients) {
		$amounts{$recipeIngredient} = $max + 1;
	}
}

# Output optimal amounts
open (my $outfile, ">", "amounts.txt") || die "Could not open file: $!";
foreach my $ingredient (keys %amounts) {
	print $outfile $ingredient." ".$amounts{$ingredient}."\n";
}
close $outfile;

# Schedule Deliveries
open(my $orderfile, "<", "orders.txt") || die "Could not open file: $!";
my @orders = <$orderfile>;
close $orderfile;

open (my $deliveryfile, ">", "deliveries.txt") || die "Could not open file: $!";
foreach my $order (@orders) {
	my @orderIngredients = split('-',$order);
	my %orderAmounts;
	foreach my $orderIngredient (@orderIngredients) {
		$orderAmounts{$orderIngredient} = 0;
	}
	foreach my $orderIngredient (keys %orderAmounts) {
		print $deliveryfile $orderIngredient." ".$amounts{$orderIngredient}."\n";
	}
}
close $deliveryfile;

# Calculate resource utilization
my %usage;
foreach my $ingredient (keys %amounts) {
	$usage{$ingredient} = 0;
}
foreach my $order (@orders) {
	my @orderIngredients = split('-',$order);
	foreach my $orderIngredient (@orderIngredients) {
		$usage{$orderIngredient}++;
	}
}

# Output resource utilization
open ($outfile, ">", "usages.txt") || die "Could not open file: $!";
foreach my $ingredient (keys %usage) {
	print $outfile $ingredient." ".$usage{$ingredient}."\n";
}
close $outfile;

# Calculate food waste
my %waste;
foreach my $ingredient (keys %amounts) {
	$waste{$ingredient} = $amounts{$ingredient} - $usage{$ingredient};
}

# Output food waste
open ($outfile, ">", "wastages.txt") || die "Could not open file: $!";
foreach my $ingredient (keys %waste) {
	print $outfile $ingredient." ".$waste{$ingredient}."\n";
}
close $outfile;